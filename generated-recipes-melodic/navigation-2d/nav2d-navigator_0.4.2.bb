# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package provides a node for higher level navigation of a mobile     robot in a planar environment. It needs a map and the robot's position     within this map to create a plan for navigation. When used together with     a SLAM module it can also be used to perform autonomous exploration of     the robot's workspace."
AUTHOR = "Sebastian Kasperski <sebastian.kasperski@dfki.de>"
ROS_AUTHOR = "Sebastian Kasperski <sebastian.kasperski@dfki.de>"
HOMEPAGE = "http://wiki.ros.org/robot_operator"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "navigation_2d"
ROS_BPN = "nav2d_navigator"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-generation \
    nav2d-msgs \
    nav2d-operator \
    pluginlib \
    roscpp \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    nav2d-msgs \
    nav2d-operator \
    pluginlib \
    roscpp \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    nav2d-msgs \
    nav2d-operator \
    pluginlib \
    roscpp \
    std-srvs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_navigator/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "eb3d66029cedf33110771bdc4630a499"
SRC_URI[sha256sum] = "d2f314f6da94486aaa5a19d27aa7c1a598950b95287b37a494359ba2911881aa"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_navigator-0.4.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('navigation-2d', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('navigation-2d', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-2d/navigation-2d_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-2d/navigation-2d-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-2d/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-2d/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
