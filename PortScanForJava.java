/*
*     �˹�����2019.7.9��ʽ�깤�ϴ���GitHub
*     ��д��:SKY��SEC KaMi
*     SKY��ȫ�Ŷӡ��������ġ�����ʼ��
*/


import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class PortScanForJava {

    public static void main(String[] args) {
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("+---����ӭʹ��SKY��ȫ�Ŷӳ����˿�ɨ����-JAVA�汾-�����ߣ�SKY.KaMi��---+");
        System.out.println("+----------------��SKY��SECURITY��WWW.HI-AWSAFE.COM��-----------------+");
        System.out.println("+---------------------------------------------------------------------+");
        int[] port = new int[]{
                21, 22, 23, 80, 8080, 88, 8888, 3306, 3389, 3312, 445, 443, 1433
        };//������Ҫɨ��Ķ˿�
        Scanner scan = new Scanner(System.in);
        System.out.print("��������Ҫɨ���IP��");
        String url = scan.next();
        System.out.println("[���ڸ�IP��" + url + "ɨ����]");

        try {
            InetAddress getname = InetAddress.getByName(url);
        } catch (UnknownHostException var10) {
            System.out.println("�޷��ҵ� " + url);//�ж�url�Ƿ���ȷ
            return;
        }

        for(int nport:port){//ʹ��foreach���ѭ���˿�ɨ��
            try {
                System.out.print("[+]" + nport);
                Socket sock = new Socket(url, nport);
                System.out.println(" : open");
                switch(nport) { //���ֳ����˿ڼ�¼����
                    case 21:
                        System.out.println("��IP���ƿ�����FTP����");
                        break;
                    case 22:
                        System.out.println("��IP���ƿ�����SSH����");
                        break;
                    case 23:
                        System.out.println("��IP���ƿ�����Telnet ���� ");
                        break;
                    case 80:
                        System.out.println("��IP���ƿ�����WEB����");
                        break;
                    case 88:
                        System.out.println("��IP���ƿ�����Kerberos ������֤ϵͳ����");
                        break;
                    case 443:
                        System.out.println("��IP���ƿ�����HTTPS����");
                        break;
                    case 445:
                        System.out.println("��IP���ƿ�����SMB����");
                        break;
                    case 1433:
                        System.out.println("��IP���ƿ�����SQL server����");
                        break;
                    case 3306:
                        System.out.println("��IP���ƿ�����MySQL����");
                        break;
                    case 3312:
                        System.out.println("��IP���ƿ�����Kangle����");
                        break;
                    case 3389:
                        System.out.println("��IP���ƿ�����RDP����");
                        break;
                    case 8080:
                        System.out.println("��IP���ƿ�������ά����WWW��������� ");
                }
            } catch (IOException var9) {
                System.out.println("��close");
            }
        }

        System.out.println("---------------------");
        System.out.println("ɨ����ɣ���лʹ�á�");
    }
}

