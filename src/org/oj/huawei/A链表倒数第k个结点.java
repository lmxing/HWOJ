package org.oj.huawei;

/**
输出单向链表中倒数第k个结点
输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第0个结点为链表的尾指针。
链表结点定义如下：
struct ListNode
{
      int       m_nKey;
      ListNode* m_pNext;
};
详细描述：
接口说明
原型：
ListNode* FindKthToTail(ListNode* pListHead, unsignedint k);
输入参数：
        ListNode* pListHead  单向链表
     unsigned int k  倒数第k个结点
输出参数（指针指向的内存区域保证有效）：
    无
返回值：
        正常返回倒数第k个结点指针，异常返回空指针
 
 

输入描述:

输入说明
1 输入链表结点个数
2 输入链表的值
3 输入k的值


输出描述:

输出一个整数

输入例子:

8
1 2 3 4 5 6 7 8
4

输出例子:

4

 */
import java.util.Scanner;

class ListNode{
	int val;
	ListNode next;
	ListNode(){
		
	}
	ListNode(int val){
		this.val = val;
	}
}
public class A链表倒数第k个结点 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			ListNode head = new ListNode(-1);
			int n = in.nextInt();
			ListNode cur = head;
//			cur = cur.next;
			for(int i=0;i<n;i++){
				int val = in.nextInt();
				ListNode p = new ListNode(val);
				cur.next = p;
				cur = cur.next;
			}
			int k = in.nextInt();
			int kVal = getLastK(head,k);
			System.out.println(kVal);
		}
	}
	/**
	 * 有头结点 找到倒数第k个结点
	 * @param head
	 * @param k
	 * @return
	 */
	private static int getLastK(ListNode head,int k){
		ListNode p1 = head;
		ListNode p2 = head;
		while(k>=0){
			p1 = p1.next;
			if(p1 == null){
				return -1;
			}
			k--;
		}
		while(p1!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2.val;
	}

}
