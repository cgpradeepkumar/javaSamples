package sample.java.annotation.example1;

import java.lang.annotation.Documented;

/**
 * Created by pkumar on 22/9/17.
 */
@Documented
public @interface ClassPreamble {
    String author();
    String date(); // attribute value must be constant
    int currentRevision() default 1;
    String lastModified() default "NA";
    String lastModifiedBy() default  "NA";
    String[] reviewers();
}
