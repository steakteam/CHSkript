# CHSkript
A CommandHelper extension for accessing Skript stuff 

## Functions

| Function Name  | Returns | Arguments  | Description                                     |
| -------------- | ------- | ---------- | ----------------------------------------------- |
| store_value_sk | void    | key, value | Put the given value into Skript database.       |
| get_value_sk   | mixed   | key        | Returns a variable value that stored in Skript. |

## Examples

```javascript
store_value_sk("sk_key", "a CHString stored in Skript.")
@value = get_value_sk("sk_key") 
msg("This is @value")
```

> This is a CHString stored in Skript.