Assignment: Extend the Notification System with a PushNotification Class
You're building upon the NotificationService interface introduced in previous lessons. 
Your mission is to implement a brand-new notification channel: Push Notifications! 
This task will help you sharpen your interface implementation skills while simulating a real-world extensible notification system.

 

📌 What You Must Include
A PushNotification class that implements NotificationService

The sendNotification(String message) method inside PushNotification

A Main class that:

Creates an instance of PushNotification

Calls sendNotification() using the NotificationService reference

Also tests the existing EmailNotification and SMSNotification implementations

Clear console output like:

"Sending Push Notification: New message received!"

"Sending SMS Notification: Meeting reminder!"

You’re tasked with enhancing the existing notification system by introducing a PushNotification class. 
This class should follow the same interface-based structure as EmailNotification and SMSNotification.
