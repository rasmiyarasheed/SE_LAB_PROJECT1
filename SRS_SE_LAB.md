**Software Requirements Specification ![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.001.png)**

**for** 

**NITCONF** 

**Prepared by** 

**Rasmiya  B210598CS  [rasmiya_b210598cs@nitc.ac.in ](mailto:rasmiya_b210598cs@nitc.ac.in)Aiswarya V S  B211258CS  [aiswarya_b211258cs@nitc.ac.in ](mailto:aiswarya_b211258cs@nitc.ac.in)Sonu Kumar Mandal                 B210590CS                      [ sonukumar_b210590cs@nitc.ac.in** ](mailto:sonukumar_b210590cs@nitc.ac.in)**

**Course: Software Engineering Laboratory     Date: 16/01/2024** 

***Software Requirements Specification for NITCONF ![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.002.png)***

1. Introduction  

   `         `Document purpose 

`         `Product scope 

`         `Intended Audience and Document Overview 

2. Overall Description  Product Overview  Product Functionality 
2. Specific Requirements 

External Interface Requirements  

User Interfaces  

`     `Software Interfaces 

`                 `Functional Requirements  

Use Case Model  

4. Other Non-functional Requirements Performance Requirements Safety and Security Requirements 



|**1  Introduction** |
| - |
||
The NITCONF project is a dynamic web solution crafted to facilitate the seamless submission and evaluation of academic papers for conferences. This web platform allows individuals to submit papers for evaluation by a team of designated reviewers. Following the review process, a Program Committee will make decisions on paper acceptance or rejection and subsequently notify the speakers. This section provides an overview of the project's core objectives, significance, and its relevance ![ref1]to the intended users. 

`  `**Document Purpose** 

This Software Requirements Specification (SRS) document serves as a comprehensive guide for the NITCONF project. Its primary purpose is to define the functional and non-functional requirements of the system, fostering a shared understanding among stakeholders, including developers, testers, project managers, and clients. The document serves as a roadmap for the development process, ensuring alignment with the client's vision. Moreover, it establishes the foundation for testing, validation, and future enhancements of the NITCONF project , providing a valuable resource throughout the system's lifecycle. 

`  `**Product Scope** 

The NITCONF project aims to develop an intuitive web platform that simplifies the submission of papers for academic conferences and enhances the evaluation process. It includes features such as the Call for Papers (CFP) submission, paper review by designated reviewers, and decision-making by the Program Committee. The system emphasizes user-friendly interactions, robust security, and 

efficient data management. 

**Intended Audience and Document Overview** 

This SRS document is intended for a diverse audience of stakeholders involved in the development, testing, and deployment of the NITCONF. The primary intended audience includes: 

- **Developers**: Those responsible for designing, implementing, and testing the NITCONF system to meet the specified requirements. 
- **Testers**: Tasked with verifying that the system adheres to defined requirements. 
- **Project Managers**: Overseeing project execution, progress, and delivery. 
- **Clients**: Individuals or organizations hosting academic conferences and approving the final implementation of the NITCONF. ![ref1]
- **System Administrators**: Responsible for maintaining and managing the NITCONF post deployment. 
- **Quality Assurance Teams**: Those responsible for ensuring the overall quality and reliability of the NITCONF. 

**2 Overall Description ![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.004.png)**

`  `**Product Overview** 

The NITCONF Submission and Evaluation System (NSES) is a web-based platform specifically designed to facilitate the submission and evaluation of papers for the NITCONF conference. The system offers a user-friendly interface with distinct functionalities for speakers, designated reviewers, and members of the Program Committee, ensuring a seamless and efficient process. 


- **User Registration:** 
- Participants, including speakers, reviewers, and Program Committee members, can securely register to create their accounts within the system. 
- **User Login:** 
- Registered users can log in to access the platform's features, ensuring a personalized and secure experience. 
- **Paper Submission:** 
- Speakers can utilize a dedicated "Submit Abstract" button to initiate the paper submission process, accessing a secure login site. 
- **Reviewer Portal:** 

`                  `Designated reviewers can log in to the system to access papers assigned for review,                                                                                         providing detailed comments and assigning a ranking on a predefined scale.

`                `Set deadlines for    reviewers to submit their evaluations. 

**Program Committee Decision-Making:** 

- Members of the Program Committee can log in to a dedicated portal to collectively review comments and make informed decisions on paper acceptance or rejection, 

  shaping the conference program. 

- **Paper Status Tracking:** 
- Participants, including speakers and reviewers, can track the status of their submissions within the system. 





**3 Specific Requirements ![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.006.png)**

`  `**External Interface Requirements** 

**User Interfaces ( program committee)** 

**Intuitive Design: ![ref1]**

- The NSES user interface is thoughtfully designed to be intuitive, ensuring a clear and engaging layout that enhances the overall user experience. 

  **Access via Login Page:** 

- Upon launching the application, Program Committee members are directed to a dedicated login page. Here, they are prompted to enter their user credentials, including a user ID and password, ensuring secure and authorized access to the system. 

  **Login Confirmation:** 

- Upon successful login, the system promptly issues a confirmation message, assuring Program Committee members of a successful login and facilitating a smooth entry into the system. 

  **New User Registration:** 

- In the event that a Program Committee member is new to the system, they will seamlessly navigate to a registration page, where they can efficiently create their account. 

**Design and Layout:** 

- The user interface boasts a visually appealing design with carefully chosen graphic elements, font styles, and a harmonious colour scheme. These considerations are made to optimize readability and organizational clarity, with a focus on 

  accommodating users with colour vision impairments. **Uniform Design Consistency:** 

- The NSES maintains a consistent design across its various interfaces, ensuring a cohesive and unified user experience for Program Committee members. 

  **User-Focused Clarity:** 

- The software is specifically geared towards user-centricity, with design elements aimed at facilitating a clear understanding and ease of use for Program Committee members. 

  **Task Support:** 

The user interface provides comprehensive support for Program Committee tasks, including the ability to seamlessly view review comments for all submitted papers. Additionally, the interface facilitates efficient decision-making by allowing Committee members to accept or reject papers directly from the platform. 

**Software Interfaces ![ref1]**

Software Used  Description ![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.007.png)![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.008.png)

Operating System  Linux Operating System Database 

We have used springboot for server-side development and MySQL, an open-source relational database management system. 

HTML, CSS, JS  Used in the development of the front-end of the application. 

`  `**Functional Requirements** 

- **User Registration:** 
- Program Committee members can securely register to create their accounts within the system.
- New user should be able to create accounts by giving valid credentials
- 
- **User Login:** 
- Registered users can log in to vaild username and password to access the platform's features, ensuring a personalized and secure experience.
- 
- **Dashboard**
- In dashboard the person can access all the platform features through the navbar.
- The navbar contain Home,Reviews,Reviewed papers,Unreviewed papers,Accepted papers and Rejected papers buttons.
- so that the person can access all the features easly.
- 
-  **Reviews**
-  The reviews will contain all the reviews details.
-  That contain their name, field, contact and email also.
-  
-  **Reviewed papers**
-  The reviewed papers we can see all the reviewed papers.
-  This contain the all details like the paper title and the authors name .
-  And also it contain 3 popup windows View Details,View Reviews and Choose Decision.
-  View Details : This will contain title ,authors name and a the abstract of the paper.
-  View Reviews : This will contain title,authors name and Reviews of the paper.
-  Choose decision: This  will also contain title ,authors name and choose the decision toggle button.
-  In this we can accept or reject the papers.
-  
-  **Unreviewed Papers**
-  The unreviewed papers we can see all the unreviewed papers.
-  Assign Reviewer: The unreviewed papers  will assign each of the reviewr.
-  In there we can select Reviewer to that papers.
- We fix a limit that Each reviewer can review only 3 papers.
- if we assign more than 3 papers to a reviewer it show that reviewer has reached the review limit.
- so we can assign the paper to another reviewer.
- Set Deadline: In this also set the deadline for reviewers to review the papers.
- 
- **Accepted papers**
- It will shown  all accepted papers.
- 
- **Rejected Papers**
- It will shown all the rejected papers.
- 

`  `**Use Case Model** 

`  `**Login - U1 (Program Committee Member)** 

Author – Rasmiya 

Purpose - To log in to the NITCONF  as a Program Committee member. Priority - High. 

**Pre conditions** – 

1\.The Program Committee member must have valid login credentials. 2.The NITCONF system must be accessible. 

**Post conditions** - ![ref1]

The Program Committee member successfully logs into the NITCONF system. 

`    `Actors – Program Committee Member    Extends – None 

`   `Flow of Events: 

1. Basic Flow - 
   1. The Program Committee member attempts to log in using their credentials. 
   1. Successful login grants access to the Program Committee portal. 
1. Alternative Flow - 
   1. Incorrect credentials result in an error message: "Invalid Login." 
   1. The system redirects to the login page. 
1. Exceptions - 
- Program Committee member encounters technical issues during login. 
- Incorrect credentials provided. 

Includes - None Notes/Issues – None 

**View Paper Reviews and Make Decisions - U16 (Program Committee Member) ![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.009.png)**

Author – Aiswarya 

Purpose - To view review comments of all submitted papers and make decisions to accept or reject. 

Priority - High. **Preconditions -![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.010.png)**

1. Program Committee member must be logged into the NSES system. 
1. Papers submitted for review should be available in the system. 

**Post conditions** - 

1. The Program Committee member successfully reviews comments and makes decisions on the submitted papers. 
1. Acceptance or rejection decisions are recorded and communicated to relevant stakeholders. 

: ![ref1]

`   `Actors – Program Committee Member    Extends – None 

`   `Flow of Events: 

1. Basic Flow - 
   1. The Program Committee member logs into the system. 
   1. Selects the "View Paper Reviews" option from the Program Committee portal. 
   1. Reviews comments on each paper along with the ranking. 
   1. Makes a decision to accept or reject each paper. 
   1. Records the decisions. 
1. Alternative Flow - 
   1. If there are no papers available for review, a message is displayed indicating the absence of papers for evaluation. 
1. Exceptions - 
- Technical issues during the paper review process. 
- Incomplete data or missing reviews. 

Includes - None Notes/Issues - 

**4 Other Non-functional Requirements ![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.011.png)![](Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.012.png)**

**Performance Requirements** 

The search and retrieval functionalities in the NITCONF  depend on the timely updates made to the system. The system must promptly respond to user requests, allowing them to efficiently search for and submit papers in a matter of seconds. During peak submission periods, the system should handle a high volume of paper submissions to ensure a smooth and satisfactory user experience. Furthermore, the system should efficiently process abstract submissions and reservations while maintaining reliable and responsive performance. Overall, the performance of the system will be optimized for speed, accuracy, and user satisfaction. 

**Safety and Security Requirements** 

All data within the NITCONF S must be securely stored in a protected database to safeguard sensitive information, including paper submissions and reviewer feedback. While users interact with the system to submit papers, view reviews, and make decisions, robust access controls will be implemented to ensure that only authorized personnel, such as Program Committee members, can modify or make decisions on papers. This stringent access control mechanism helps prevent unauthorized changes, preserving the integrity of the system's records and fostering confidence 

among users in the reliability and security of the NITCONF service.. 

[ref1]: Aspose.Words.447b504a-902d-41a1-9532-bf96f8a3b898.003.png
