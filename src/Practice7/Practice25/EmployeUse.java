package Practice7.Practice25;

public class EmployeUse {
    public static void main(String[] args) {
        Employe[] employe=new Employe[3];
        employe[0]=new Employe("ehsan",3000,15);
        employe[1]=new Employe("soheyl",3000,14);
        employe[2]=new Employe("Ali",2600,12);
        System.out.println(totalSalary(employe));
    }
    public static double totalSalary(Employe[] employe){
        double sum = 0;
        for (Employe item:employe) {
            sum+= (item.getSalary()+(item.getSalary()*(item.getBonus()/100)));
        }
        return sum;
    }

}
