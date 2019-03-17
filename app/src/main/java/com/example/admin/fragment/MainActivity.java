package com.example.admin.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Respond(String data){
        FragmentManager manager=getSupportFragmentManager();
        fragment_3 f3= (fragment_3) manager.findFragmentById(R.id.fragment3);


        switch (data)
        {
            case "Computer / Information Technology Engineering":
                f3.changetext("Department of Computer Engineering was established in the year 2009, with the objective of imparting quality education in the field of Computer Engineering.\n\tThe department started with a 4 year graduate program in Computer Engineering with the aim to develop core competence in the field and to prepare the students to carry out development work, as well as take up challenges in industries and research areas. The curriculum was designed keeping industrial and research needs in view, as well as the rapid development in the IT industry.\n\tThe department started its 2 year post graduate program as well as Ph.D program in Computer Engineering in the year 2012 imparting a breadth of advanced knowledge in various areas of Computer Engineering. \n\tDepartment has well equipped laboratories with latest high tech hardware as well as software facilities. The department has state of the art infrastructure and computing equipment supported by high speed Ethernet and wireless networks. Faculty members are well qualified and many of them acquainted with industrial experience");
                break;
            case "Chemical Engineering":
                f3.changetext("Department of Chemical Engineering was established in the year 2015. The department started with a 4 Year Graduate Program in Chemical Engineering with an objective is to prepare students for professional practice, graduate study, lifelong learning and to learn novel scientific and technological concepts used for chemical engineering practice.\n\tChemical Engineering at CGPIT is a mixture of traditional Chemical Engineering as well as the upcoming areas of Chemical Engineering. The department has qualified faculty members engaged in teaching with the aim of achieving excellence in various fields. We aim at educating our students to discover and disseminate knowledge through research. We are committed to achieve excellence and evaluates success using the highest standards of quality, innovation, and visibility, while at the same time providing a friendly and supportive atmosphere. Our students have full access to the University's rich infrastructure and culture. Most of the courses are designed in such a fashion that there are ample scope for students to think beyond the class room teaching and learn innovative techniques to solve real life problems. \n");
                break;
            case "Mechanical / Automobile Engineering":
                f3.changetext("Department of Mechanical Engineering was established in 2010 to accomplish the necessity of competent Mechanical engineers in the current phase of infrastructure development in the state as well as nation. To realize, the curriculum has been designed with close interaction of faculty members with the experts from the industries. \n\tTo have hands-on experience, laboratories are developed indigenously. The department owns laboratories in the area of Fluid engineering, Thermal engineering, Mechanical Measurement, Manufacturing engineering, Automobile engines, Automobile systems etc.");
                break;
            case "Civil Engineering":
                f3.changetext("The department is one of the pioneering departments since the commencement of the college in 2009. The department has qualified faculty members engaged in teaching with the aim of achieving excellence in various fields. The faculty members are specialized in different disciplines of Civil Engineering. The vision of this department is to shape infrastructure development with social focus. The mission of the department is to\n-->Developing Professional Civil Engineers\n-->Offering Continuing Education\n-->Interacting with Industry with emphasis on R&D\n");
                break;
        }
    }

}
