public class Main {
    public static void main(String[] args) {

        check("dhhr_1", "jfklknfla_1", "jfklknfla_1");

    }

    public static void check(String login, String password, String confirmPassword) {
        try {
            checkParams(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Некорректный  ввод данных параметра login");
        } catch (WrongPasswordException e) {
            System.out.println("Некорректный ввод данных параметра password или confirmPassword");
        } finally {
            System.out.println("Проверка завершена");
        }
    }


    public static void checkParams(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        boolean validLogin = login.matches("\\w+");
        if (!validLogin || login.length() > 20) {
            throw new WrongLoginException();
        }

        boolean validPassword = password.matches("\\w+");
        if (!validPassword || password.length() > 19) {
            throw new WrongPasswordException();
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
