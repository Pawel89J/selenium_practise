package baseElements;

import core.TAEBaseObject;
import core.TAEDriver;

public class BaseAbstractForm extends TAEBaseObject {
    TAEDriver driver;

    public BaseAbstractForm(TAEDriver driver) {
        this.driver = driver;
    }
}
