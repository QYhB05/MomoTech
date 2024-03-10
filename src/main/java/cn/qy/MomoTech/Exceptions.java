package cn.qy.MomoTech;

public class Exceptions {
    public static class NumberBugException extends Exception {
        public String toString() {
            return "NUMBER_BUG";
        }
    }

    public static class NumberBugIException extends Exception {
        public String toString() {
            return "NUMBER_BUGI";
        }
    }

    public static class NumberBugIIException extends Exception {
        public String toString() {
            return "NUMBER_BUGII";
        }
    }

    public static class NumberBugIIIException extends Exception {
        public String toString() {
            return "NUMBER_BUGIII";
        }
    }

    public static class NumberBugIVException extends Exception {
        public String toString() {
            return "NUMBER_BUGIV";
        }
    }

    public static class NumberBugVException extends Exception {
        public String toString() {
            return "NUMBER_BUGV";
        }
    }


}
