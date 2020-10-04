# NameContains
A quick minecraft plugin for someone on spigot, not a commission.

(Coded under 1.8 api however should work on all versions)

All this plugin does is:
If a player joins with a certain string in their name as set in the config, it will run a command set in the config.

Can be set to case sensitive or not too.

Only made due to someone asking here

Default config:
Code (YAML):

nameContains: # What words should be listened for?
  - 'banned'
  - 'word'
commands: # The commands that should be ran upon seeing a player join with a name containing the above ({player} is for the player name)
  - 'kick {player} banned name!' #

ignoreCase: true # Should the case nameContains be case sensitive or no
I doubt this will be used by many people, but it's there anyways.
