package examples.users;

import com.intuit.karate.junit5.Karate;

class RunnerFile {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("ReadingDataFromCSVFile.feature").relativeTo(getClass());
    }    

}
