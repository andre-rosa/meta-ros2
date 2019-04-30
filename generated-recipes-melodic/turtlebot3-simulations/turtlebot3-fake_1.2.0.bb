# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for TurtleBot3 fake node. With this package, simple tests can be done without a robot.     You can do simple tests using this package on rviz without real robots."
AUTHOR = "Pyo <pyo@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_fake"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    turtlebot3-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    turtlebot3-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    robot-state-publisher \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    turtlebot3-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_simulations-release/archive/release/melodic/turtlebot3_fake/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4e77ff6db071e5115db7c068488ff188"
SRC_URI[sha256sum] = "5e76727354184cc0f97b0cf61d4c3743301e431c5d46bbd87436fbed8f1e2e95"
S = "${WORKDIR}/turtlebot3_simulations-release-release-melodic-turtlebot3_fake-1.2.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/turtlebot3-simulations/turtlebot3-simulations_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/turtlebot3-simulations/turtlebot3-simulations_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-simulations/turtlebot3-simulations-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-simulations/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-simulations/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
