# ChainOfResponsabilityDesignPattern

Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle
the request. Chain the receiving objects and pass the request along the chain until an object handles it.

Consider a context-sensitive help facility for a graphical user interface. The user can obtain help
information on any part of the interface just by clicking on it. The help that's provided depends on the
part of the interface that's selected and its context; for example, a button widget in a dialog box might
have different help information than a similar button in the main window. If no specific help information
exists for that part of the interface, then the help system should display a more general help message
about the immediate context—the dialog box as a whole, for example.
Hence it's natural to organize help information according to its generality—from the most specific to the
most general. Furthermore, it's clear that a help request is handled by one of several user interface
objects; which one depends on the context and how specific the available help is.
The problem here is that the object that ultimately provides the help isn't known explicitly to the object
(e.g., the button) that initiates the help request. What we need is a way to decouple the button that
initiates the help request from the objects that might provide help information. The Chain of
Responsibility pattern defines how that happens.
The idea of this pattern is to decouple senders and receivers by giving multiple objects a chance to handle
a request. The request gets passed along a chain of objects until one of them handles it.

# Applicability

Use Chain of Responsibility when
- more than one object may handle a request, and the handler isn't known a priori. The handler
should be ascertained automatically.
- you want to issue a request to one of several objects without specifying the receiver explicitly.
- the set of objects that can handle a request should be specified dynamically.
