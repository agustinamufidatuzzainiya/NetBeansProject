/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author niya
 */
class Link {
 public int Data;
 public Link next;
 public Link previous;
 public Link(int Data) {
 this.Data = Data;
 }
 public void displayLink() {
 System.out.print(Data + " ");
 }
}
class DoublyLinkedList {
 private Link first;
 private Link last;
 public DoublyLinkedList() {
 first = null;
 last = null;
 }
 public boolean isEmpty() {
 return first == null;
 }
 public void insertFirst(int Data) {
 Link newLink = new Link(Data);
 if (isEmpty()) {
 last = newLink;
 } else {
 first.previous = newLink;
 }
 newLink.next = first;
 first = newLink;
 }
 public void insertLast(int Data) {
 Link newLink = new Link(Data);
 if (isEmpty()) {
 first = newLink;
 } else {
 last.next = newLink;
 newLink.previous = last;
 }
 last = newLink;
 }
public Link deleteFirst() {
 Link temp = first;
 if (first.next == null) {
 last = null;
 } else {
 first.next.previous = null;
 }
 first = first.next;
 return temp;
 }
 public Link deleteLast() {
 Link temp = last;
 if (first.next == null) {
 first = null;
 } else {
 last.previous.next = null;
 }
 last = last.previous;
 return temp;
 }
 public boolean insertAfter(int key, 
 int Data) {
 Link current = first;
 while (current.Data != key) {
 current = current.next;
 if (current == null) {
 return false;
 }
 }
 Link newLink = new Link(Data);
 if (current == last) {
newLink.next = null;
 last = newLink;
 } else {
 newLink.next = current.next;
 current.next.previous = newLink;
 }
 newLink.previous = current;
 current.next = newLink;
 return true;
 }
 public Link deleteKey(int key) {
 Link current = first;
 while (current.Data != key) {
 current = current.next;
 if (current == null) {
 return null;
 }
 }
 if (current == first) {
 first = current.next;
 } else {
 current.previous.next =
 current.next;
 }
 if (current == last) {
 last = current.previous;
 } else {
 current.next.previous =
 current.previous;
 }
 return current;
 }
 public void displayForward() {
 System.out.print("List ” " + "(first-->last): ");
 Link current = first;
 while (current != null) {
 current.displayLink();
 current = current.next;
 }
 System.out.println("");
 }
 public void displayBackward() {
 System.out.print("List ” + “(last-->first): ");
 Link current = last;
 while (current != null) {
 current.displayLink();
 current = current.previous;
 }
 System.out.println("");
 }
} // akhir class
public class DoublyLinkedListApp {
 public static void main(String[] args) {
 DoublyLinkedList theList = 
 new DoublyLinkedList();
 theList.insertFirst(22);
 theList.insertFirst(44);
 theList.insertFirst(66);
 theList.displayForward();
 theList.insertLast(11);
 theList.insertLast(33);
 theList.insertLast(55);
 theList.displayForward();
 theList.displayBackward();
 theList.deleteFirst();
 theList.displayForward();
 theList.deleteLast();
 theList.displayForward();
 theList.deleteKey(11);
 theList.displayForward();
 theList.insertAfter(22, 77);
 theList.insertAfter(33, 88);
 theList.displayForward();
 }
}

