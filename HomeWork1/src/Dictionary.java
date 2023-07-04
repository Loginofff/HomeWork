public class Dictionary {
    private static class Pair {
        private String key;
        private String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Pair[] pairs;
    private int count;

    public Dictionary() {
        this.pairs = new Pair[10];
        this.count = 0;
    }

    public void put(String key, String value) {
        for (int i = 0; i < count; i++) {
            if (pairs[i].key.equals(key)) {
                pairs[i].value = value;
                return;
            }
        }
        Pair pair = new Pair(key, value);
        this.pairs[count] = pair;
        count++;
    }

    public String get(String key) {
        for (int i = 0; i < count; i++) {
            if (pairs[i].key.equals(key)) {
                return pairs[i].value;
            }
        }
        return key;
    }

    public class Translator {
        public String[] translate(String[] text) {
            String[] translatedText = new String[text.length];
            for (int i = 0; i < text.length; i++) {
                translatedText[i] = get(text[i]);
            }
            return translatedText;
        }
    }}