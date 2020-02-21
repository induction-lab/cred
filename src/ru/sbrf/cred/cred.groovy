package ru.sbrf.cred

def withCred(script, credId, Closure body) {
    script.withCredentials([[
        $class: 'UsernamePasswordMultiBinding',
        credentialsId: credId,
        passwordVariable: 'p',
        usernameVariable: 'u'
    ]]) { body() }
}