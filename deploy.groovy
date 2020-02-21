@Library('cred@master')
import ru.sbrf.cred.*

node() {
    stage("dummy") {
        echo("ok")
        def cred = new Cred()
        cred.say(this, "GO!")
    }
}