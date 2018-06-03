package com.jenkins.demo;

/*
Jenkins demo is module to test Jenkins &
git functionlaity together & upadting comments
*/
class JenkinsDemo {

    int var;
    String myStr;

    JenkinsDemo(){
    }

 
    public void sayhelloJenkins(){
        System.out.println(" Hello jenkins !!!!");
    }
   
    public void setVar(int var){
        this.var = var;
    }
    
    public int getVar(){
       return  this.var;
    }

}
