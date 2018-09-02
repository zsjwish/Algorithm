package books;

/**
 * created by zsj in 20:20 2018/9/2
 * description:
 **/
public class Student implements Comparable{

    public String name;

    public int chineseGrade;

    public int englishGrade;

    public int mathGrade;

    public Student(String name, int chineseGrade, int englishGrade, int mathGrade) {
        this.name = name;
        this.chineseGrade = chineseGrade;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseGrade() {
        return chineseGrade;
    }

    public void setChineseGrade(int chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getTotal(){
        return this.getChineseGrade() + this.getEnglishGrade() + this.getMathGrade();
    }

    public String toString() {
        return "姓名：" + this.name + "  总分 ：" + this.getTotal() + "  语文 ： " + this.getChineseGrade()
                + "  英语 ： " + this.getEnglishGrade() + "  数学 ： " + this.getMathGrade() + "\n";
    }

    @Override
    public int compareTo(Object o) {
        return this.getTotal() - ((Student) o).getTotal();
    }
}
