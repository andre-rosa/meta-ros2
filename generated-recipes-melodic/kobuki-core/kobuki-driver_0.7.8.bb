# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ driver library for Kobuki:     Pure C++ driver library for Kobuki. This is for those who do not wish to use ROS on their systems."
AUTHOR = "Daniel Stonier <stonier@yujinrobot.com>"
HOMEPAGE = "http://ros.org/wiki/kobuki_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-command-line \
    ecl-converters \
    ecl-devices \
    ecl-geometry \
    ecl-mobile-robot \
    ecl-sigslots \
    ecl-time \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-command-line \
    ecl-converters \
    ecl-devices \
    ecl-geometry \
    ecl-mobile-robot \
    ecl-sigslots \
    ecl-time \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-command-line \
    ecl-converters \
    ecl-devices \
    ecl-geometry \
    ecl-mobile-robot \
    ecl-sigslots \
    ecl-time \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_driver/0.7.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fb1becd0b45cb57aaced3b9c5d9fe998"
SRC_URI[sha256sum] = "7cfcc4b9309c4a352fa54c9a6cb0fb0b53a5da43a0243aa13556670ec97bd34e"
S = "${WORKDIR}/kobuki_core-release-release-melodic-kobuki_driver-0.7.8-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/kobuki-core/kobuki-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/kobuki-core/kobuki-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/kobuki-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
