public class JNISealExample {
    // Native method declaration
    private native void nativeMethod();

    // Load the native library
    static {
        System.loadLibrary("jni_seal_example");
    }

    public static void main(String[] args) {
        // Create an instance and call the native method
        JNISealExample example = new JNISealExample();
        example.nativeMethod();
    }
}
