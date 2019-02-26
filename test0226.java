/*
 * ����һ�� n �� n �Ķ�ά�����ʾһ��ͼ��
��ͼ��˳ʱ����ת 90 �ȡ�
˵����
�������ԭ����תͼ������ζ������Ҫֱ���޸�����Ķ�ά�����벻Ҫʹ����һ����������תͼ��

ʾ�� 1:
���� matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

ԭ����ת�������ʹ���Ϊ:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

ʾ�� 2:
���� matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

ԭ����ת�������ʹ���Ϊ:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
*/
package lianxi0226;

public class test0226 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int[][] matrix = new int[][]{
			{ 5, 1, 9,11},
			{ 2, 4, 8,10},
			{13, 3, 6, 7},
			{15,14,12,16}   };
		S.rotate(matrix);
	}
}

class Solution {
    public void rotate(int[][] matrix)
    {
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++)
        {
            int start = i;
            int end = len - i - 1;
            for (int j = 0; j < end - start; j++)
            {
                int temp = matrix[start][start + j];
                matrix[start][start + j] = matrix[end - j][start];
                matrix[end - j][start] = matrix[end][end - j];
                matrix[end][end - j] = matrix[start + j][end];
                matrix[start + j][end] = temp;
            }
        }
        for(int i = 0; i< len; i++)
        {
        	for(int j = 0; j<len; j++)
        	{
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}