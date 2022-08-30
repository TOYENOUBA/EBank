/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.local;

import entities.Transaction;
import javax.ejb.Local;
import services.GenericServiceBeanLocal;

/**
 *
 * @author TR7
 */
@Local
public interface TransactionServiceBeanLocal extends GenericServiceBeanLocal<Transaction, Long> {

}
