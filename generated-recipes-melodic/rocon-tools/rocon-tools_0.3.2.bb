# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities and tools developed for rocon, but usable beyond the boundaries     of rocon."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/rocon_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rocon-console \
    rocon-ebnf \
    rocon-interactions \
    rocon-launch \
    rocon-master-info \
    rocon-python-comms \
    rocon-python-redis \
    rocon-python-utils \
    rocon-python-wifi \
    rocon-semantic-version \
    rocon-uri \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rocon-console \
    rocon-ebnf \
    rocon-interactions \
    rocon-launch \
    rocon-master-info \
    rocon-python-comms \
    rocon-python-redis \
    rocon-python-utils \
    rocon-python-wifi \
    rocon-semantic-version \
    rocon-uri \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_tools/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "db93653d10929791c2a89a79e81e48d1"
SRC_URI[sha256sum] = "688fc316688135e08e1fd33312879d6059122f1fd9122c4ded28dd4177b59cce"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_tools-0.3.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rocon-tools/rocon-tools_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rocon-tools/rocon-tools_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-tools/rocon-tools-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-tools/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-tools/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
