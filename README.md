# Hugo WorldAnvil BBCode

A Hugo project template that converts your Markdown content into both HTML and WorldAnvil BBCode formats.

## Features

- **Dual Output**: Generate standard HTML pages and WorldAnvil-compatible BBCode files from the same Markdown source
- **Automatic Conversion**: HTML elements are automatically converted to WorldAnvil BBCode tags

## Quick Start

### 1. Get the project (choose one option)

#### 1A. Fork and clone (recommended)

Fork the repository on GitHub first, then clone your fork.

```bash
git clone https://github.com/{username/org}/{forked-repo-name}.git
```

#### 1B. Clone directly

```bash
git clone https://github.com/greenmatthew/hugo-worldanvil-bbcode.git
```

### 2. Create content

```bash
hugo new content/test.md
```

or

```bash
hugo new content/{path}.md
```

### 3. Build your content

```bash
# Serve locally for development
hugo server

# Build the site
hugo
```

Or use the Justfile if you have [Just](https://github.com/casey/just) installed.

Then you will find your WorldAnvil BBCode in the `public/` directory with the file extension `.bb`:

```bash
# Find all BBCode files
find public/ -name "*.bb"
```

## Contributing

I use Hugo for my portfolio website but am no expert. Some tags may be missing support. If you want to make a contribution via a pull request, knock yourself out!

## License

MIT License - see [LICENSE](./LICENSE) for details.
