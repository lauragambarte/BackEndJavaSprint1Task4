package nivel2.ejercicio1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
//FEATURE MATCHER: matches on a feature of an object defined by featurevalueof, instead of matching the entire object.
public class MyMatcher extends FeatureMatcher<String,Integer> {
    public MyMatcher(Matcher<? super Integer> subMatcher) {
        super(subMatcher, "expected lenght of string","length of actual string");
    }

    @Override
    //protected: can be used in the subclass, feature:caracteristica, length es Integer.
    protected Integer featureValueOf(String s) {
        return s.length();
    }
}
