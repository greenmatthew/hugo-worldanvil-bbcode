[h1]{{ .Title }}[/h1]

{{ $newline := printf "\n\n" }}
{{-
    .Content
    | replaceRE `<h1[^>]*>(.*?)</h1>` `[h1]$1[/h1]`
    | replaceRE `<h2[^>]*>(.*?)</h2>` `[h2]$1[/h2]`
    | replaceRE `<h3[^>]*>(.*?)</h3>` `[h3]$1[/h3]`
    | replaceRE `<h4[^>]*>(.*?)</h4>` `[h4]$1[/h4]`
    | replaceRE `<p[^>]*>(.*?)</p>` (printf `$1%s` $newline)
    | replaceRE `<strong[^>]*>(.*?)</strong>` `[b]$1[/b]`
    | replaceRE `<em[^>]*>(.*?)</em>` `[i]$1[/i]`
    | replaceRE `(?s)<ul[^>]*>(.*?)</ul>` `[ul]$1[/ul]`
    | replaceRE `(?s)<ol[^>]*>(.*?)</ol>` `[ol]$1[/ol]`
    | replaceRE `<li[^>]*>(.*?)</li>` `[li]$1[/li]`
    | replaceRE `(?s)<details[^>]*>\s*<summary[^>]*>(.*?)</summary>(.*?)</details>` `[spoiler]$2| $1 [/spoiler]`
    | replaceRE `\n\n\n+` $newline
    | safeHTML
-}}