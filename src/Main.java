public class Main {
    static void main(String[] args) {
//      .substring()= A method used to extract a portion of a string
//        .substring(start, end)

        String email = "nmf_wasi@yahhoo.com";
        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1 , email.lastIndexOf('m') + 1);
        System.out.println(email);
        System.out.println(username);
        username=email.substring(email.indexOf('@'));
        System.out.println(username);
        System.out.println(domain);
        domain = email.substring(email.indexOf('@')+1);
        System.out.println(domain);

        System.out.println(email.contains("@"));
        System.out.println(email.contains("Wasi"));

    }

}
