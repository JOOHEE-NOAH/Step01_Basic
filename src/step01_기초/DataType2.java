package step01_����;

/* System.out.printf("�޽��� or ���Ĺ���", ����1, ����n) -���Ĺ��� ������ ���� ���� ��ġ ��Ű��
 * --�����
 * %s : ���ڿ� String
 * %c : ���� char
 * %d : ���� int, char, long
 * %f : �Ǽ� float, double
 */

//1byte=8bit
//�ڸ����� ����ġ

public class DataType2 {

	public static void main(String[] args) {
		String name="�̼���";
		String dept="���ߺ�";
		char gender='M';
		double score=85.3;
		int age=25;
		float tall=183.4f;  //float tall=(float)183.4;

		System.out.printf("�̸� : %s\n",name);
		System.out.printf("�μ� : %s\n",dept);
		System.out.printf("���� : %c\n",gender);
		System.out.printf("���� : %.2f\n",score);  //�Ҽ��� �Ʒ� ��°�ڸ����� ǥ�� 
		System.out.println(score);
		System.out.println(String.format("���� : %.2f\n",score));
		

		
		
		System.out.printf("���� : %10.2f\n",score);
		System.out.printf("���� : %-10.2f\n",score);
		System.out.printf("���� : %d\n",age);
		System.out.printf("���� : %.1f\n",tall);
		
		
		
		
	}

}
