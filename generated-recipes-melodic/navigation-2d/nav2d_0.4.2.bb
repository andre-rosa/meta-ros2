# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Meta-Package containing modules for 2D-Navigation"
AUTHOR = "Sebastian Kasperski <sebastian.kasperski@dfki.de>"
HOMEPAGE = "http://wiki.ros.org/navigation_2d"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_BPN = "nav2d"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    nav2d-exploration \
    nav2d-karto \
    nav2d-localizer \
    nav2d-msgs \
    nav2d-navigator \
    nav2d-operator \
    nav2d-remote \
    nav2d-tutorials \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nav2d-exploration \
    nav2d-karto \
    nav2d-localizer \
    nav2d-msgs \
    nav2d-navigator \
    nav2d-operator \
    nav2d-remote \
    nav2d-tutorials \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c1b8c19055c565a0e62ce7b497415a22"
SRC_URI[sha256sum] = "290981964bfb9d4a38651fa57f321fe5b777363ac3e0b6f8dc0fd69ba4ec0a6b"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d-0.4.2-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('navigation-2d', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-2d/navigation-2d_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-2d/navigation-2d-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-2d/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-2d/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
