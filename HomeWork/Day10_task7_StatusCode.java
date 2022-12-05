package HomeWork;

public class Day10_task7_StatusCode {
    public static void main(String[] args) {
        int code=509;
        String Result=(code==200)?"ok":(code==201)?"Created":(code==202)?"Accepted":
                (code==301)?"Moved Permanently":(code==303)?"See Other":(code==304)?"Not Modified":
                        (code==307)?"Temporary Redirect":(code==400)?"Bad Request":
                        (code==401)?"Unauthorized":(code==403)?"Forbidden":
                        (code==404)?"Not Found":(code==410)?"Gone":(code==500)?"Internal Sever Error"
                         :(code==503)?"Service Unavailbale":"Wrong Service Unavalible";
        System.out.println(Result);
    }
}
