package exercise;

// BEGIN
public class ReversedSequence implements CharSequence{
    String string;

    public ReversedSequence(String string) {
        StringBuffer buffer = new StringBuffer(string);
        this.string = buffer.reverse().toString();
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.substring(start, end);
    }

    @Override
    public String toString() {
        return string;
    }
}
// END
