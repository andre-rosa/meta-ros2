# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interaction management for human interactive agents in the concert."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rocon_interactions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "rocon_interactions"

ROS_BUILD_DEPENDS = " \
    python-catkin-pkg \
    roslint \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    genpy \
    python-rospkg \
    rocon-app-manager-msgs \
    rocon-bubble-icons \
    rocon-console \
    rocon-icons \
    rocon-interaction-msgs \
    rocon-python-comms \
    rocon-python-utils \
    rocon-std-msgs \
    rocon-uri \
    rospy \
    std-msgs \
    unique-id \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    genpy \
    python-rospkg \
    rocon-app-manager-msgs \
    rocon-bubble-icons \
    rocon-console \
    rocon-icons \
    rocon-interaction-msgs \
    rocon-python-comms \
    rocon-python-utils \
    rocon-std-msgs \
    rocon-uri \
    rospy \
    std-msgs \
    unique-id \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_interactions/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9ee8f8f8609eb3567e8f397f8a2d921f"
SRC_URI[sha256sum] = "bbfd5de04fbedd3259af8cc8d03812de838a6a9cc3d38c48772640218cfbe1b7"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_interactions-0.3.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rocon-tools/rocon-tools_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rocon-tools/rocon-tools_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-tools/rocon-tools-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-tools/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-tools/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
