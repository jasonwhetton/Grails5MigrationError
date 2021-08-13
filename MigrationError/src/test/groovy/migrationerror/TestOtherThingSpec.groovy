package migrationerror

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TestOtherThingSpec extends Specification implements DomainUnitTest<TestOtherThing> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
