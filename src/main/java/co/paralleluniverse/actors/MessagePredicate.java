/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.paralleluniverse.actors;

/**
 *
 * @author pron
 */
public interface MessagePredicate<Message> {
    boolean matches(Message message);
}