/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03015_hieu_hai_so_nguyen_lon_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println(a.subtract(b));
    }
    
}
