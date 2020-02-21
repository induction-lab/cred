package ru.sbrf.cred

class Cred {

    static def use(script, credId, Closure body) {
        script.withCredentials([[
            $class: 'UsernamePasswordMultiBinding',
            credentialsId: credId,
            passwordVariable: 'p',
            usernameVariable: 'u'
        ]]) { body(script.u, script.p) }
    }

    static def say(script, text) {
        script.echo(text)
    }

}
