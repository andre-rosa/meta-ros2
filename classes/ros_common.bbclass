# ros_common.bbclass

DISTROOVERRIDES .= ":${ROS_DISTRO_EDITION}:${ROS_DISTRO}"

ROS_BPN = "${@d.getVar('BPN', True).replace('-', '_')}"

ROS_SPN ?= "${ROS_BPN}"
ROS_SP = "${ROS_SPN}-${PV}"
