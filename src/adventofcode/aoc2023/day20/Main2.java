package adventofcode.aoc2023.day20;

import java.util.*;

public class Main2 {

    static String s1 = "broadcaster -> a, b, c\n" +
            "%a -> b\n" +
            "%b -> c\n" +
            "%c -> inv\n" +
            "&inv -> a";

    static String s2 = "broadcaster -> a\n" +
            "%a -> inv, con\n" +
            "&inv -> b\n" +
            "%b -> con\n" +
            "&con -> output";

    static String s3 = "%nz -> jm, ms\n" +
            "%xk -> cs, ks\n" +
            "%rh -> ks\n" +
            "%ml -> mf, ks\n" +
            "%mf -> ks, km\n" +
            "&ms -> lq, fm, sz\n" +
            "%bk -> zz, ks\n" +
            "%zf -> dn\n" +
            "%qf -> kf\n" +
            "%zv -> mz, ms\n" +
            "&tc -> mn, xf, jl, xs, zk\n" +
            "%hd -> dn, mm\n" +
            "%nv -> pn, dn\n" +
            "&gc -> zr\n" +
            "&ks -> jn, cs, cm\n" +
            "%vz -> pz, tc\n" +
            "%jl -> ps\n" +
            "%lq -> ms, fm\n" +
            "%fl -> ms\n" +
            "%zz -> ks, vd\n" +
            "%td -> bj, tc\n" +
            "broadcaster -> mn, jn, hd, lq\n" +
            "&dn -> jk, qf, gc, hf, hd, nr, mm\n" +
            "%vd -> ks, ml\n" +
            "%cp -> fl, ms\n" +
            "%jn -> ks, xk\n" +
            "%xg -> tc\n" +
            "%xs -> zk\n" +
            "%kf -> dz, dn\n" +
            "%qx -> ks, rh\n" +
            "%kb -> ms, tl\n" +
            "%mm -> nv\n" +
            "%mn -> tc, xs\n" +
            "%cs -> gb\n" +
            "%jm -> ms, cp\n" +
            "%bj -> tc, xx\n" +
            "%pn -> dn, jk\n" +
            "%fm -> zv\n" +
            "%jk -> nr\n" +
            "%pz -> td, tc\n" +
            "%xx -> tc, xg\n" +
            "%gb -> bk, ks\n" +
            "%dz -> zb, dn\n" +
            "%vl -> jl, tc\n" +
            "&sz -> zr\n" +
            "%gx -> ms, kb\n" +
            "%zb -> dn, zf\n" +
            "%tl -> pp, ms\n" +
            "%pp -> nz, ms\n" +
            "%km -> ks, qx\n" +
            "%ps -> tc, vz\n" +
            "%mz -> ms, gx\n" +
            "&cm -> zr\n" +
            "%hf -> qf\n" +
            "&zr -> rx\n" +
            "&xf -> zr\n" +
            "%nr -> hf\n" +
            "%zk -> vl\n";

    public static void main(String[] args) {
        // zr feeds into rx
        // cm, sz, gc, xf feed into zr
        // answer is lcm of each of the 4 feeders

        int buttonPushes = 5000;
        List<Module> modules = new ArrayList<>();

        // fetch modules
        String[] ss = s3.split("\n");
        Broadcaster br = null;
        for (String st : ss) {
            String u = st.split(" -> ")[0];
            String v = st.split(" -> ")[1];
            String[] vv = v.split(", ");
            if (u.equals("broadcaster")) {
                br = new Broadcaster("broadcaster", Arrays.asList(vv), "none");
                modules.add(br);
            }
            if (u.startsWith("%")) {
                modules.add(new FlipFlop(u.substring(1), Arrays.asList(vv), "off"));
            }
            if (u.startsWith("&")) {
                modules.add(new Conjunction(u.substring(1), Arrays.asList(vv), "low"));
            }
        }

        for (String st: ss) {
            String u = st.split(" -> ")[0];
            String v = st.split(" -> ")[1];
            String[] vv = v.split(", ");

            for (int i = 0; i < vv.length; i++) {
                String cn = vv[i];
                modules.stream().filter(c -> c.name.equals(cn)).findFirst().ifPresent(conjunction -> conjunction.addMemory(u.substring(1)));
            }
        }
        Queue<Pulse> pulses = new ArrayDeque<>();
        int low = 0; int high = 0;
        int sol = 0;
        for (int i = 0; i < buttonPushes; i++) {
            pulses.add(new Pulse("broadcaster", "low"));
            while (!pulses.isEmpty()) {
                Pulse pulse = pulses.remove();
                if (sol == 0 && pulse.sourceModule != null && pulse.sourceModule.equals("xf") && pulse.pulseType.equals("high")) {
                    sol = i + 1;
                }
                if (pulse.pulseType.equals("low")) {
                    low++;
                } else {
                    high++;
                }
                System.out.println(pulse);
                Module module = modules.stream().filter(m -> m.name.equals(pulse.destinationModule)).findFirst().orElse(null);
                if (module != null) {
                    List<Pulse> c = module.processPulse(pulse);
                    pulses.addAll(c);
                }
            }
        }

        // sz = 4093 cycles
        // cm = 4091 cycles
        // gc = 3853 cycles
        // xf = 4073 cycles
        // multiply manually
    }

    static class Pulse {
        String sourceModule;
        String destinationModule;
        String pulseType;

        public Pulse(String sourceModule, String destinationModule, String pulseType) {
            this.destinationModule = destinationModule;
            this.sourceModule = sourceModule;
            this.pulseType = pulseType;
        }

        public Pulse(String destinationModule, String pulseType) {
            this.destinationModule = destinationModule;
            this.pulseType = pulseType;
        }

        @Override
        public String toString() {
            return "Pulse{" +
                    "sourceModule='" + sourceModule + '\'' +
                    ", destinationModule='" + destinationModule + '\'' +
                    ", pulseType='" + pulseType + '\'' +
                    '}';
        }
    }

    static abstract class Module {
        List<String> outgoingModules;
        String moduleState;
        String name;

        public Module(String name, List<String> outgoingModules, String moduleState) {
            this.outgoingModules = outgoingModules;
            this.moduleState = moduleState;
            this.name = name;
        }

        abstract List<Pulse> processPulse(Pulse pulse);
        void addMemory(String pulse) {}
    }

    static class Broadcaster extends Module {
        public Broadcaster(String name, List<String> outgoingModules, String moduleState) {
            super(name, outgoingModules, moduleState);
        }

        @Override
        List<Pulse> processPulse(Pulse pulse) {
            List<Pulse> result = new ArrayList<>();

            for (int i = 0; i < outgoingModules.size(); i++) {
                result.add(new Pulse(name, outgoingModules.get(i), pulse.pulseType));
            }
            return result;
        }

    }

    static class Conjunction extends Module {
        Map<String, String> memory = new HashMap<>();

        public Conjunction(String name, List<String> outgoingModules, String moduleState) {
            super(name, outgoingModules, moduleState);
        }

        @Override
        public void addMemory(String input) {
            memory.put(input, "low");
        }

        @Override
        List<Pulse> processPulse(Pulse pulse) {
            List<Pulse> result = new ArrayList<>();

            memory.remove(pulse.sourceModule);
            memory.put(pulse.sourceModule, pulse.pulseType);

            boolean b = true;
            for (String input : memory.keySet()) {
                if (memory.get(input).equals("low")) {
                    b = false;
                    break;
                }
            }
            for (int i = 0; i < outgoingModules.size(); i++) {
                result.add(new Pulse(name, outgoingModules.get(i), b ? "low" : "high"));
            }

            return result;
        }

    }

    static class FlipFlop extends Module {

        public FlipFlop(String name, List<String> outgoingModules, String moduleState) {
            super(name, outgoingModules, moduleState);
        }

        @Override
        List<Pulse> processPulse(Pulse pulse) {
            List<Pulse> result = new ArrayList<>();
            if (pulse.pulseType.equals("low")) {
                if (moduleState.equals("off")) {
                    moduleState = "on";
                } else {
                    moduleState = "off";
                }
                String newPulseType = moduleState.equals("on") ? "high" : "low";
                for (int i = 0; i < outgoingModules.size(); i++) {
                    result.add(new Pulse(name, outgoingModules.get(i), newPulseType));
                }
            }
            return result;
        }
    }


}
