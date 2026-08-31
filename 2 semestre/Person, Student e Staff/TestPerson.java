public class TestPerson {
    public static void main(String[] args) {
        // Testando Student
        Student student = new Student("Davi de Souza Almeida", "Santos, SP", "Análise e Desenvolvimento de Sistemas", 2026, 500.00);
        System.out.println("--- Testando Student ---");
        System.out.println(student.toString());
        
        student.setProgram("Sistemas de Informação");
        student.setYear(2027);
        student.setFee(550.00);
        student.setAddress("São Paulo, SP");
        System.out.println("Update Student: " + student.toString());
        
        System.out.println("Get Program: " + student.getProgram());
        System.out.println("Get Year: " + student.getYear());
        System.out.println("Get Fee: " + student.getFee());
        System.out.println("Get Address: " + student.getAddress());

        System.out.println("\n--- Testando Staff ---");
        Staff staff = new Staff("Wellington Tuler Moraes", "Cubatão, SP", "IFSP - Campus Cubatão", 4500.00);
        System.out.println(staff.toString());
        
        staff.setSchool("IFSP - Campus Santos");
        staff.setPay(5000.00);
        System.out.println("Update Staff: " + staff.toString());
        
        System.out.println("Get School: " + staff.getSchool());
        System.out.println("Get Pay: " + staff.getPay());
    }
}