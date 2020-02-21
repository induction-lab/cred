package ru.sbrf.cred

class Cred {

    def use(script, credId, Closure body) {
        script.withCredentials([[
            $class: 'UsernamePasswordMultiBinding',
            credentialsId: credId,
            passwordVariable: 'p',
            usernameVariable: 'u'
        ]]) { body(script.u, script.p) }
    }

    def say(script, text) {
        script.echo(text)
    };

}
