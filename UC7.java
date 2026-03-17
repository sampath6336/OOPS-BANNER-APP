public class UC7 {

    
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        
        public char getCharacter() {
            return character;
        }

       
        public String[] getPattern() {
            return pattern;
        }
    }

    
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                " *****   "
        });

        characterPatternMap[1] = new CharacterPatternMap('P', new String[]{
                "******   ",
                "*     *  ",
                "*     *  ",
                "******   ",
                "*        ",
                "*        ",
                "*        "
        });

        characterPatternMap[2] = new CharacterPatternMap('S', new String[]{
                " *****   ",
                "*        ",
                "*        ",
                " *****   ",
                "      *  ",
                "      *  ",
                " *****   "
        });

        characterPatternMap[3] = new CharacterPatternMap(' ', new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        });

        return characterPatternMap;
    }

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }

        return new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        };
    }

   
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}
    

