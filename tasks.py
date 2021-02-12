from invoke import task


P = 'scalajs-deno-example-fastopt'


@task
def compile(c):
    """sbt fastLinkJS"""
    c.run('sbt fastLinkJS')


@task(compile)
def run(c):
    """run with deno"""
    c.run(f"deno run -A target/scala-2.13/{P}/main.js")


@task(compile)
def dist(c):
    """dist"""
    c.run('mkdir -p dist')
    c.run(
        f"deno compile --unstable --lite -o dist/example target/scala-2.13/{P}/main.js")


@task(dist)
def run_binary(c):
    """run binary"""
    c.run('./dist/example')


# @task
# def run(c):
#    """sbt run"""
#    c.run('sbt run')


@task(default=True)
def usage(c):
    """Usage"""
    c.run('invoke -l')
