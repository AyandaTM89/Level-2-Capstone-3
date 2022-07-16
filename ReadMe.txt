THE TASK AT HAND
You have been asked to create a project management system for a small structural
engineering firm called “Poised”. Poised does the engineering needed to ensure
the structural integrity of various buildings. They want you to create a Java
program that they can use to keep track of the many projects on which they work.
Poised stores the following information for each project that they work on:
● Project number.
● Project name.
● What type of building is being designed? E.g. House, apartment block or
store, etc.
● The physical address for the project.
● ERF number.
● The total fee being charged for the project.
● The total amount paid to date.
● Deadline for the project.
● The name, telephone number, email address and physical address of the
architect for the project.
● The name, telephone number, email address and physical address of the
contractor for the project.
● The name, telephone number, email address and physical address of the
customer for the project.
Poised wants to be able to use your program to do the following:
● Capture information about new projects. If a project name is not provided
when the information is captured, name the project using the surname of
the customer. For example, a house being built by Mike Tyson would be
called “House Tyson” and an apartment block owned by Jared Goldman
would be called “Apartment Goldman”.
● Update information about existing projects. Information may need to be
adjusted at different stages throughout the lifecycle of a project. For

example, the deadline might change after a meeting with various
stakeholders.
● Finalise existing projects. When a project is finalised, the following should
happen:
○ An invoice should be generated for the client. This invoice should
contain the customer’s contact details and the total amount that the
customer must still pay. This amount is calculated by subtracting the
total amount paid to date from the total fee for the project. If the
customer has already paid the full fee, an invoice should not be
generated.
○ The project should be marked as “finalised” and the completion date
should be added. All the information about the project should be
added to a text file called “Completed project”.
● See a list of projects that still need to be completed.
● See a list of projects that are past the due date.
● Find and select a project by entering either the project number or project
name.
