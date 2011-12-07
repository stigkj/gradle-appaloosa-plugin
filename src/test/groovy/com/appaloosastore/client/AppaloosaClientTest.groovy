package com.appaloosastore.client

import spock.lang.Specification

/**
 * @author Stig Kleppe-Jorgensen, 2011.12.07
 * @todo fill in
 */
class AppaloosaClientTest extends Specification {
    def 'should'() {
        expect:
        def client = new AppaloosaClient("test")
        client.deployFile('/tmp/txt.out')
    }
}
