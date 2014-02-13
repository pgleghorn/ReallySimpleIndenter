 Usage: java -jar ReallySimpleIndenter.jar <i>filename</i>

 A really simple text indenter, has lots of bugs and many restrictions.
 written because it was quicker to do this than it was to read the
 indent(1) man page.
 
 <ul>
 <li> takes one optional argument, the file to read
 <li> if not specified, reads from stdin
 <li> writes to stdout
 <li> expects only one { or } per line
 <li> does not check if braces are unbalanced
 <li> uses the normal line breaks from the input, not when a brace is actually encountered on a line
 <li> indent width not configurable
 <li> character to indent on is not configurable, only curly braces
 <li> no way to select brace style
 </ul>
