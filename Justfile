# Justfile for Hugo commands

# Uncomment one of these lines for Windows:
# set shell := ["powershell.exe", "-c"]
# set shell := ["cmd.exe", "/c"]

# Default recipe - shows help information (just --list also works)
@help:
    just -l

# Build the site
build:
    hugo --cleanDestinationDir

# Start the Hugo server for local development
serve:
    hugo server

# Start the Hugo server with fast render disabled (useful for testing content changes)
serve-no-fast-render:
    hugo server --disableFastRender

# Clean up the compiled site (sorry no Windows support for this rule)
clean:
    rm -rf public

# Clean up everything including Hugo's build lock (sorry no Windows support for this rule)
clean-all:
    rm -rf public .hugo_build.lock
