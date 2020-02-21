@Library('cred@master')
import ru.sbrf.cred.Cred1.*

node() {
    stage("dummy") {
        echo("ok")
        say(this, "GO!")
    }
}