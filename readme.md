# ElytraLevels (ElytraCore)
An advanced SQL supported level tracking system and utility framework for the
elytraforce network.

# Features
- SQL support
- Wrapper for players accessible through the api that tracks stats
- Vault and PlaceholderAPI support
- Level, XP, and Money tracking configurable via config
- Match tracking system
- Stats and end-of-round GUIs per match
- Match UUID controller
- Match killfeeds and enemy health tracker via bossbar
- Timed restart system
- Built in essentials replacing commands
- Advanced reward system with GUI and configurable via config

# Todo / Bugs
- Test the timedrestart (I'm not staying up until 2 am)
- Redis messaging util
- Finish filling out the matchtracker events so they can be called
- Add the different gamemodes to the EF stat GUI
- Setup testing branches on Git
- Promotion and Demotion menu

- IMPORTANT - transactionally based elytraplayers as opposed to schedule based (Save stats on transaction and cache player on join vs saving stats on leave)