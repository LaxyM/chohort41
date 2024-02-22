package lesson_27.Theory;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }





    // jo22.hn@testn.et
    /*
    1. готово - @ должен присутствовать и он должен быть только один
    2. Готово – точка после собаки
    3. готово – точка не может быть сразу после собаки
    4. готово – после последней точки должно быть не менее двух символов.
    5. готово — могут присутствовать только буквы алфавита, цифры, «-», «_», «.», «@».
    6. готово - Первый символ должен быть - алфавитный
      = Место для @ - хотя b на один символ перед собакой
     */
    private boolean isEmailValid(String email) {

        // проверяем что пришел не null и не пустая строка
        if (email == null || email.isEmpty())
            return false;

        // tttt@trtrtr.n.et
        // 1. @ |
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@'))
            return false;

        // 2. Должна быть точка после @

        // Перегрузка метода — начинается после с индекса (в данном случае знак индекса @
        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1)
            return false;

        // 3. LastDot
        if (email.lastIndexOf('.') >= email.length() - 2)
            return false;

        // true - если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic)
            return false;


        // 5. Могут присутствовать только символы алфавита, цифры, '-', '_', '.', '@'.

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            //true, если символ удовлетворяет хотя бы одному из критериев.
            boolean isCharValid = (
                    Character.isAlphabetic(c)
                            || Character.isDigit(c)
                            || c == '-'
                            || c == '_'
                            || c == '.'
                            || c == '@');

            if (!isCharValid) return false;

        }

        // Все проверки пройдены, метод нигде не вернул false ->
        return true;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    /*
    ******************************Home Work******************************************
     */
    /* Требования к валидности пароля
    1. длина пароля >= 8
    2. мин 1 маленькая буква
    3. мин 1 большая буква
    4. мин 1 цифра
    5. мин 1 спец символ ("!%$@&*()[]")

     */

    public static boolean isPasswordValid(String password) {

        // проверяем что пришел не null и не пустая строка
        if (password == null || password.isEmpty())
            return false;


        // Длина пароля больше или равна 8 символам
        if (password.length() >= 7) {
            return false;
        }

        // Должна быть мин одна маленькая буква
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }

        // Должна быть мин одна большая буква
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        // Должна быть мин одна цифра
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        // Должен быть мин спец символ ("!%$@&*()[]")
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            //true, если символ удовлетворяет хотя бы одному из критериев.
            boolean isCharValid = (
                    Character.isAlphabetic(c)
                            || Character.isDigit(c)
                            || c == '!'
                            || c == '%'
                            || c == '$'
                            || c == '@'
                            || c == '&'
                            || c == '*'
                            || c == '('
                            || c == ')'
                            || c == '['
                            || c == ']');

            if (!isCharValid) return false;

        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
