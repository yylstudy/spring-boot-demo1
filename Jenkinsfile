node{
    checkout scm
    echo "current branch is:$BRANCH_NAME"
    echo "------this project is spring boot demo1"
    stage('Build') {
        def GIT_REVISION = readFile('.git/HEAD') =~ '(.+)'
        echo "GIT_REVISION: ${GIT_REVISION}"
        GIT_REVISION = GIT_REVISION ? GIT_REVISION[0][1] : null
        if (GIT_REVISION) {
          echo "GIT_REVISION: ${GIT_REVISION}"
        }
        sh 'mvn -B -DskipTests clean package --settings /home/yyl/yyl/apache-maven-3.6.3/conf/settings.xml'
        sh 'touch testfile'
        sh 'echo "hello liyang" > testfile'
        sh 'echo "BUILD_ID:"${BUILD_ID} -> testfile'
        echo 'Building..'
    }
    stage('Test') {
        echo 'Testing..'
    }
    stage('Deploy') {
        sh "sshpass -p 'yyl' scp target/*-SNAPSHOT.jar yyl@192.168.242.129:/home/yyl"

    }
}
